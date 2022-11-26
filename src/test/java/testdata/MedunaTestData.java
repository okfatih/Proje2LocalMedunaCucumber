package testdata;

import com.github.javafaker.Bool;

import java.util.HashMap;
import java.util.Map;

public class MedunaTestData {

    public Map<String, Object> medunaUserMethod(String createdBy, String createdDate, Integer id, String login , String firstName, String lastName, String email, Boolean activated, String langKey, Object imageUrl, String resetDate, String ssn){
        Map<String, Object> medunaUserMap = new HashMap<>();
        medunaUserMap.put("createdBy", createdBy);
        medunaUserMap.put("createdDate",createdDate);
        medunaUserMap.put("id",id);
        medunaUserMap.put(" login",login);
        medunaUserMap.put("firstName",firstName);
        medunaUserMap.put("lastName",lastName);
        medunaUserMap.put("email",email);
        medunaUserMap.put("activated",activated);
        medunaUserMap.put("langKey",langKey);
        medunaUserMap.put("imageUrl",imageUrl);
        medunaUserMap.put("resetDate",resetDate);
        medunaUserMap.put("ssn",ssn);
        return  medunaUserMap;

    }
    public Map<String,Object>expectedMethod(String createdBy, String createdDate, Integer id,  String firstName, String lastName, String birthDate,String phone, String gender, String bloodGroup, String adress, String email, String description,Map<String, Object>medunauser,String appointments, String inPatients, String country, String cstate){
        Map<String, Object>expectedDataMapa = new HashMap<>();
        expectedDataMapa.put("createdBy",createdBy);
        expectedDataMapa.put("createdDate",createdDate);
        expectedDataMapa.put("id",id);
        expectedDataMapa.put("firstName",firstName);
        expectedDataMapa.put("lastName",lastName);
        expectedDataMapa.put("",birthDate);
        expectedDataMapa.put("phone",phone);
        expectedDataMapa.put("gender",gender);
        expectedDataMapa.put("bloodGroup",bloodGroup);
        expectedDataMapa.put("adress",adress);
        expectedDataMapa.put("email",email);
        expectedDataMapa.put("description",description);
        expectedDataMapa.put("medunauser",medunauser);
        expectedDataMapa.put("appointments",appointments);
        expectedDataMapa.put("inPatients",inPatients);
        expectedDataMapa.put("country",country);
        expectedDataMapa.put("cstate",cstate);
        return expectedDataMapa;
    }
}
