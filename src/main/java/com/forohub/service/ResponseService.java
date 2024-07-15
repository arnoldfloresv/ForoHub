package com.forohub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.forohub.model.Response;
import com.forohub.repository.ResponseRepository;

import java.util.List;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository responseRepository;

    public List<Response> getAllResponses() {
        return responseRepository.findAll();
    }

    public Response createResponse(Response response) {
        return responseRepository.save(response);
    }

    public Response getResponseById(Long id) {
        return responseRepository.findById(id).orElse(null);
    }

    public Response updateResponse(Long id, Response response) {
        Response existingResponse = responseRepository.findById(id).orElse(null);
        if (existingResponse != null) {
            existingResponse.setMessage(response.getMessage());
            existingResponse.setSolution(response.getSolution());
            responseRepository.save(existingResponse);
        }
        return existingResponse;
    }

    public void deleteResponse(Long id) {
        responseRepository.deleteById(id);
    }
}
