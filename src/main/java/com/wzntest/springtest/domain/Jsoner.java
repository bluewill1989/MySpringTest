package com.wzntest.springtest.domain;

import com.wzn.api.util.JsonUtils;
import net.sf.json.JSONObject;

/**
 * DESCRIPTION:
 *
 * @author will
 * @create 2018-11-06 14:03
 */
public class Jsoner {

    private JSONObject jsonObject = new JSONObject();

    public static void main(String[] args) {
        Jsoner jsoner = new Jsoner();
        jsoner.jsonObject.put("key1", "1");
        jsoner.jsonObject.put("key2", "2");
        System.out.println(JsonUtils.print(jsoner.jsonObject));
    }

}