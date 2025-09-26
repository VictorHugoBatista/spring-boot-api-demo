package com.thinkconstructive.rest_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.rest_demo.model.CloudVendor;

import jakarta.websocket.server.PathParam;



@RestController
@RequestMapping("/cloud-vendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;

    public String getMethodName(@RequestParam String param) {
        return new String();
    }
 
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathParam("vendorId") String vendorId) {
        // return new CloudVendor(vendorId, "Vendor 1", "Address One", "xxxxx");
        return cloudVendor;
    }
    
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;

        return "success";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;

        return "success";
    }
}
