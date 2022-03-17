package com.hcl.admin.admin_management.controller;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import com.hcl.admin.admin_management.config.JwtTokenUtil;
import com.hcl.admin.admin_management.model.*;
import com.hcl.admin.admin_management.service.ownerService;
import com.hcl.admin.admin_management.service.systemService;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.springframework.web.multipart.MultipartFile;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/owner/")
public class ownerController {
    @Autowired
    ownerService sys;
    @Autowired
    systemService sysService;
    @Autowired
	private JwtTokenUtil jwtTokenUtil;
    @PostMapping("login")
    public OwnerEntity login(@RequestBody OwnerEntity user) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
       
        OwnerEntity u= sys.login(user);
        if(u!=null)
        {  
            System.out.println(u.getPass());
            if(bCryptPasswordEncoder.matches( user.getPass(),u.getPass()))
            {
                u.setToken(jwtTokenUtil.generateToken(Integer.toString(u.getIdOwner())));
            }
            else
            {
                u=null;
            }
        }

        return u;
    }

    @PostMapping("registers")
    public OwnerEntity registers( @RequestPart("info") OwnerEntity user ,@RequestParam("file") MultipartFile file) {

        if(sys.checkUsername(user.getUserName()))
        { 
            String uuid = UUID.randomUUID().toString();
            String filename = uuid+"."+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
            sysService.uploadFile(file,"    /"+filename);
            user.setImage(filename);
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            user.setPass(bCryptPasswordEncoder.encode(user.getPass()));
            user.setToken(jwtTokenUtil.generateToken(Integer.toString(sys.create(user).getIdOwner())));
            return user;

        }

        return null;
    }
    //create token for debug
    @GetMapping("token")
    public String to()
    {
        return jwtTokenUtil.generateToken("1");
    }

    @GetMapping("getall")
    public List<OwnerEntity> getall() {
        return sys.getAll();
    }

    @PostMapping("mail")
    public void mail(@RequestParam("contain") String text,@RequestParam("subject") String subject,@RequestParam("contain")String [] mails)
    {
        // for (String mail : mails) {
        //     try {
        //         sysService.sendmail(mail, subject, text);
        //     } catch (UnirestException e) {
        //         e.printStackTrace();
        //     }
        // }
    }
}





    
