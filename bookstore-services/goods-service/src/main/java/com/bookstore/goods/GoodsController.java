package com.bookstore.goods;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavinkim at 2019-02-08
 */
@RestController
public class GoodsController {

    @GetMapping
    public String welcome(){
        return "welcome to Bookstore Goods Service";
    }
}
