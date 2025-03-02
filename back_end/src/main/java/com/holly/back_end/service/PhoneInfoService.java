package com.holly.back_end.service;

import org.springframework.stereotype.Service;

@Service
public class PhoneInfoService {

    //根据前3位号码返回运营商信息
    public String getOperatorByPrefix(String prefix) {
        switch (prefix) {
            case "130":
            case "131":
            case "132":
            case "155":
            case "156":
            case "166":
            case "175":
            case "176":
            case "185":
            case "186":
                return "中国联通";
            case "133":
            case "149":
            case "153":
            case "173":
            case "177":
            case "180":
            case "181":
            case "189":
            case "199":
                return "中国电信";
            case "134":
            case "135":
            case "136":
            case "137":
            case "138":
            case "139":
            case "147":
            case "150":
            case "151":
            case "152":
            case "157":
            case "158":
            case "159":
            case "172":
            case "178":
            case "182":
            case "183":
            case "184":
            case "187":
            case "188":
            case "198":
                return "中国移动";
            default:
                return "未知运营商";
        }
    }

    //调用第三方API查询归属地信息
    public String getLocationByPhoneNumber(String phoneNumber) {
        return "北京市";
    }
}
