package com.thinkconstructive.rest_demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.service.CloudVendorService;



@RestController
@RequestMapping("/cloud-vendor")
public class CloudVendorAPIController
{
    CloudVendor cloudVendor;
    private final CloudVendorService cloudVendorService;

    public CloudVendorAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping
    public List<CloudVendor> getList() {
        return cloudVendorService.getList();
    }

    @GetMapping("{vendorId}")
    public CloudVendor get(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.get(vendorId);
    }
    
    @PostMapping
    public CloudVendor create(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.create(cloudVendor);
    }

    @PutMapping
    public String update(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "success";
    }

    @DeleteMapping("{vendorId}")
    public CloudVendor delete(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.delete(vendorId);
    }
}
