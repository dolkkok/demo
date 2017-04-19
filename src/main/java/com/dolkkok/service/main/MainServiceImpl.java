package com.dolkkok.service.main;

import org.springframework.stereotype.Service;
import sun.applet.Main;

/**
 * Created by hanjunghee on 2017. 4. 19..
 */
@Service
public class MainServiceImpl implements MainService {
    public String getMainPageMessage() {
        return "Main Page Message!!!";
    }
}
