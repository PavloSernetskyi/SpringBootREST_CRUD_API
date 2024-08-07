package PersonalProjects.REST_API_CRUD.controller;

import PersonalProjects.REST_API_CRUD.model.CloudVendor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cloundvendor")
public class CloudVendorAPIService {

  CloudVendor cloudVendor;
  @GetMapping("{vendorId}")
  public CloudVendor getCloudVendorDetails(String vendorId){

    return cloudVendor;
//        new CloudVendor(
//        "C1", "Vendor 1",
//        "Address One", "xxxxx");
  }

  @PostMapping("/{vendorId}")
  public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor = cloudVendor;
    return "Cloud Vendor Created Successfully";
  }

  @PutMapping("/{vendorId}")
  public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor = cloudVendor;
    return "Cloud Vendor Updated Successfully";
  }

  @DeleteMapping("/{vendorId}")
  public String deleteCloudVendorDetails(String vendorId){
    this.cloudVendor = null;
    return "Cloud Vendor Deleted Successfully";
  }

}
