package com.example.demo;
 
 
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.transport.Member;
 
@RestController
public class HelloController {
 
    @GetMapping("/api/hello")
    public String hello(){
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    }
    
    @GetMapping("/222")
    public String helloe(){
        return "연습용 문장\n";
    }
    
    @PostMapping(value="/api/login", consumes="application/json;")
    public Member login(@RequestBody HashMap<String, Object> map) {
    	System.out.println("login동작");
    	System.out.println(map);
    	Member member=new Member("chpark","1234","박찬호",28);
    	return member;
    }
    
    @RequestMapping("list")
	public List<Member> list() {
		List<Member> list = new LinkedList<Member>();
		Member member=new Member("chpark","1234","박찬호",28);
		Member member2=new Member("hwhong","5678","홍형우",28);
		Member member3=new Member("dhkim","8888","김대홍",29);
		list.add(member);
		list.add(member2);
		list.add(member3);
		
		return list;
	}
	
	@GetMapping("reg")
	public Member reg() {
		Member member=new Member("chpark","1234","박찬호",28);
		
		return member;
	}
}