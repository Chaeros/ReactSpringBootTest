//package com.test.transport;
//
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class MemberService {
//
//    //final 붙여야지 생성자 만들어줌
//    private final MemberRepository memberRepository;
//
//    public MemberResponseDto findBy(final MemberRequestDto params){
//        MemberResponseDto entity = memberRepository.findByEmailAndPasswd(params.getEmail(), params.getPasswd());
//        return entity;
//    }
//
//}
