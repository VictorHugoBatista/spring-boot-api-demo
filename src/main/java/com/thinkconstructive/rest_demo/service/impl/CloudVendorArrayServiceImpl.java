package com.thinkconstructive.rest_demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

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
    public String get() {
        // TODO Auto-generated method stub
        return null;
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
