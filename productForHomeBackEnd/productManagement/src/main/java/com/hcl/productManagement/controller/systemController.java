// package com.hcl.productManagement.controller;
// import java.util.List;

// import javax.servlet.http.HttpServletRequest;

// import com.hcl.productManagement.config.JwtTokenUtil;
// import com.hcl.productManagement.model.place;
// import com.hcl.productManagement.service.*;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
// @RestController
// @RequestMapping("/api/system/")
// public class systemController {
//     @Autowired
//     systemService sys;
//     @Autowired
// 	private JwtTokenUtil jwtTokenUtil;
//     @GetMapping("search")
//     public List<place> placeDetail(@RequestParam("key")  String key) {
//         return sys.SearchPlace(key);
//     }

//     @PostMapping("auth/wishList")
//     public void addWishList(HttpServletRequest request,@RequestParam("placeId") int id) {
//         String token = request.getHeader("authorization");
//         sys.addWishList(jwtTokenUtil.getIdFromToken(token.substring(7)),id);
//     }
// }
