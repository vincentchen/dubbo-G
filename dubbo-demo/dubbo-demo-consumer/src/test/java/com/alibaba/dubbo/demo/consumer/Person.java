package com.alibaba.dubbo.demo.consumer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.ByteArraySerializer;
import javafx.beans.binding.ObjectExpression;
import javassist.bytecode.ByteArray;

import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Map;

/**
 * Created by haoning1 on 2017/3/16.
 */
public class Person {
    private String name;
    private String age;

    private static String a = "0";

    public Person () {
        System.out.println("xxxxx1");
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    {
        System.out.println("xxxxx2");
    }

    public static void main (String[] args) {
        //new Person();
//        System.out.println(Person.a);
//        String sb = "{\"flag\":1,\"success\":1,\"expired\":0,\"page\":{\"data\":[{\"fxsno\":\"0110198385\",\"fxsname\":\"佳电（上海）管理有限公司（云贵）\",\"matnr\":\"90EACTO1WW0109829092\",\"mtart\":\"扬天T6900CI7-6700 8G 1T DVD-RW   2G独显\",\"quantity\":27,\"createby\":\"\",\"productgroupno\":\"68\",\"createdate\":\"2017-04-12 11:45:29\"}],\"pageSize\":10,\"pageindex\":1,\"sort\":1,\"sortfield\":\"fxsname\",\"total_number\":1}}";
//        JSONObject json = JSON.parseObject(sb);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("status", 1);
//        jsonObject.put("body", sb);
//        System.out.println(JSON.toJSONString(jsonObject));

        JSONObject json = new JSONObject();
        System.out.println(JSON.parseObject("{\"a\":1}", Map.class).getClass());
        JSONArray array = new JSONArray();
        array.add("hahha");
        array.add("hahha1");
        json.put("a", array.toJSONString());
//        json.put("b", new byte[]{1,2,3,4});
        System.out.println(json.toJSONString());

//        System.out.println(new String(new byte[]{1,2,3,4}));

//        System.out.println(JSON.toJSONString(new byte[]{1,2,3,4}));

//        String a = "AQIDBA==";
//        byte[] b = (byte[])JSON.parseObject(a, byte[].class);

//        System.out.println(b.length);

        String a = "true";
        try {
            Number number = NumberFormat.getInstance().parse(a);
            System.out.println(number instanceof Double);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}