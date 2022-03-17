package com.hcl.admin.admin_management.service;

import com.hcl.admin.admin_management.rep.rentRep;
import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.csv.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.*;

@Service
public class systemService {

  @Autowired
  rentRep brep;

  // @Value("${mailgun.api-key}")
  // private String apikey;
  // @Value("${mailgun.domain}")
  // private String domain;

  private Path rootLocation;

  systemService() {

    this.rootLocation = Paths.get("src\\main\\resources\\upload");

  }


  public String uploadFile(MultipartFile file, String filename) {
    try {
      if (file.isEmpty()) {
        System.out.println("File is null");
      }

      try (InputStream inputStream = file.getInputStream()) {

        Files.copy(file.getInputStream(), this.rootLocation.resolve(filename),
            StandardCopyOption.REPLACE_EXISTING);
        System.out.println("ok");
        return "ok";
      }
    } catch (Exception e) {
      System.out.println(e);
      System.out.println("error");
    }
    return null;
  }

  // public JsonNode sendmail(String mail, String subject, String containt) throws UnirestException {
  //   HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + domain + "/messages")
  //       .basicAuth("api", apikey).field("from", "alta@" + domain)
  //       .field("to", mail)
  //       .field("subject", subject)
  //       .field("text", containt)
  //       .asJson();
  //   return request.getBody();
  // }

}
