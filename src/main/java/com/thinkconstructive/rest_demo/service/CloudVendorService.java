package com.thinkconstructive.rest_demo.service;

import java.util.List;

import com.thinkconstructive.rest_demo.model.CloudVendor;

public interface CloudVendorService {
    public List<CloudVendor> getList();
    public String get();
    public String create(CloudVendor cloudVendor);
    public String update();
    public String delete();
}
