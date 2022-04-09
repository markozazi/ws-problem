package com.example.web;


import com.example.ws.gekon.InputSetRow;
import com.example.ws.gekon.MERGETIFFQuery;
import com.example.ws.gekon.MERGETIFFReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class MergeTiffEndpoint {
    private static final String NAMESPACE_URI = "urn:Gekon";

    Logger logger = LoggerFactory.getLogger(MergeTiffEndpoint.class);


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MERGE_TIFFRequestElement")
    @ResponsePayload
    public MERGETIFFReturn merge(@RequestPayload MERGETIFFQuery request) {

        List<InputSetRow> list = request.getDocuments().getValue().getDocument();

        logger.info("List size is " + list.size());

        list.forEach((doc) ->
                System.out.println("Value is " + doc.getDocFormat().getValue())
        );

        return null;
    }
}
