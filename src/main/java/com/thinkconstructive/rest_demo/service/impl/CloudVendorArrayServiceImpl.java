package com.thinkconstructive.rest_demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.thinkconstructive.rest_demo.exceptions.CloudVendorNotExistsException;
import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.service.CloudVendorService;

@Service
public class CloudVendorArrayServiceImpl implements CloudVendorService {
    private ArrayList<CloudVendor> vendors = new ArrayList<CloudVendor>();

    @Override
    public String create(CloudVendor cloudVendor) {
        vendors.add(cloudVendor);
        return "success";
    }

    @Override
    public String delete() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CloudVendor get(String vendorId) {
        try {
            return vendors
                .stream()
                .filter(vendor -> vendor.getVendorId().equals(vendorId))
                .collect(Collectors.toList())
                .get(0);
        } catch (IndexOutOfBoundsException e) {
            throw new CloudVendorNotExistsException("Vendor id ${vendorId} doesn't exists");
        }
    }

    @Override
    public List<CloudVendor> getList() {
        return vendors;
    }

    @Override
    public String update() {
        // TODO Auto-generated method stub
        return null;
    }
}
