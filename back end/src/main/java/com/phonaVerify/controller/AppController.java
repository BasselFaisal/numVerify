package com.phonaVerify.controller;

import com.phonaVerify.dao.PhoneDataRepository;
import com.phonaVerify.entity.PhoneData;
import com.phonaVerify.model.request.Call;
import com.phonaVerify.response.PhoneDataResponse;
import com.phonaVerify.service.RestService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AppController {

    @Autowired
    private PhoneDataRepository phoneDataRepository;

    @Autowired
    private RestService restService;

    @Autowired
    private ModelMapper mapper;

    @GetMapping("/phoneData")
    public ResponseEntity<?> getData() {

        List<PhoneData>  phoneData = phoneDataRepository.findAll();
        List<PhoneDataResponse> phoneDataResponses = new ArrayList<>();
        phoneData.stream().forEach(tutorial -> phoneDataResponses.add(mapper.map(tutorial, PhoneDataResponse.class)));

        return new ResponseEntity<>(phoneDataResponses, HttpStatus.OK);
    }
    @GetMapping("/phoneData/{number}")
    public ResponseEntity<?> getNumber(@PathVariable(value = "number") String number){

        Call call=this.restService.getPostsPlainJSON(number);

            PhoneData phoneData = new PhoneData();

            phoneData.setNumber(call.getNumber());
            phoneData.setCountry_code(call.getCountry_name());
            phoneData.setCountry_prefix(call.getCountry_prefix());
            phoneData.setCarrier(call.getCarrier());
            phoneData.setInternational_format(call.getInternational_format());
            phoneData.setValid(call.isValid());
            phoneData.setLocation(call.getLocation());
            phoneData.setLine_type(call.getLine_type());
            phoneData.setLocal_format(call.getLocal_format());
            phoneData.setCountry_code(call.getCountry_code());

        if(call.isValid() == true)
            phoneDataRepository.save(phoneData);

            return new ResponseEntity<>(phoneData, HttpStatus.OK);

    }
}
