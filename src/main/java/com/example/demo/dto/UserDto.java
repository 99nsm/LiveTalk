package com.example.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDto {

    // 회원 고유 번호 (PK)
    private Long userSeqNo;

    // 회원 이름
    private String userName;

    // 생년월일
    private LocalDate birthDt;

    // 회원 이메일(중복 불가)
    private String email;

    // 핸드폰 번호
    private String phoneNo;

    // 소셜 로그인 타입 (KAKAO, GOOGLE 등)
    private String socialType;

    // 소셜에서 제공한 사용자 ID
    private String socialId;

    // 프로필 이미지 URL
    private String profileImgUrl;

    // 프로필 배경 이미지 URL
    private String profileBgImgUrl;

    // 상태 메세지(한 줄 소개)
    private String statusMessage;

    // 회원 생성일
    private LocalDateTime usrCreateDt;

    // 회원 정보 수정일
    private LocalDateTime usrUpdateDt;

    // 탈퇴 여부 (N: 사용중, Y: 탈퇴)
    private String delYn;
}

