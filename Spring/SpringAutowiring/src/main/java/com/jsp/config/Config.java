package com.jsp.config;

import com.jsp.model.Address;
import com.jsp.model.ContactDetails;
import com.jsp.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {
    @Bean
  public Address  createObjAdd(){
      Address addr=new Address();
      addr.setHouseNo("H.No 1234");
      addr.setCity("Gurugram");
      return addr;
  }
    @Bean
    public Address  createObjAdd1(){
        Address addr=new Address();
        addr.setHouseNo("8234");
        addr.setCity("Delhi");
        return addr;
    }
  @Bean
  public Student createObjStudent(){
      Student std=new Student();
      std.setId(34);
      std.setName("Prince");
//      std.setAddress(createObjAdd());   //Manually  Wiring --Done
      return std;
  }

  @Bean
    public ContactDetails contactObj(){
        ContactDetails contactObj=new ContactDetails();
        return contactObj;
  }
    @Bean
    public ContactDetails contactObj1(){
        ContactDetails contactObj=new ContactDetails();
        return contactObj;
    }
}
