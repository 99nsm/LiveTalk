package com.example.demo.dto;

import java.time.LocalDateTime;

public class ChatRoomDto {

    // 채팅방 고유 번호 (PK)
    private Long chatRoomSeqNo;

    // 채팅방 개설자 회원 번호
    private Long creatorUserSeqNo;

    // 채팅방 타입 (S: 단일 1:1, G: 그룹)
    private String roomType;

    // 채팅방 생성일
    private LocalDateTime crCreateDt;

    // 채팅방 수정일
    private LocalDateTime crUpdateDt;

    // 채팅방 활성화 여부 (Y: 활성, N: 비활성)
    private String isActive;
}

