package com.example.GYM.Jasmine.controller;

import com.example.GYM.Jasmine.model.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.GYM.Jasmine.model.Entities.Member;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "api/member")
public class MemberController<memberService> {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public List<Member> getMembers() {
        return memberService.getMembers();
    }

    @GetMapping(path = "{memberId}")
    public Optional<Member> getMember(@PathVariable(name = "memberId") Integer memberId) {
        return memberService.getMember(memberId);
    }

    @PostMapping(path = "add")
    public void registerNewMember(@RequestBody Member member) {
        memberService.addNewMember(member);
    }

//    @DeleteMapping(path = "api/delete/{memberId}")
//    public void deleteMember(@PathVariable ("memberId") String memberId){
//        int intmemberId =Integer .parseInt(memberId);
//        memberService.deleteMember(intmemberId);




//    @GetMapping(path ="login2")
//    public String checkLogin(@RequestParam(name ="username")String username ,
//                             @RequestParam (name ="password")
//                                     String password) {
//        return memberService.getCheck(username,password);
//    }


    @DeleteMapping(path = "delete/{memberId}")
    public void deleteMember(@PathVariable ("memberId") String memberId){
       int memberInt =Integer.parseInt(memberId);
        memberService.deleteMember(memberInt);
    }



    }