package com.example.demo.dto;

import java.time.LocalDateTime;

public class ChatRoomJoinDto {

    // 채팅 참여 고유 번호 (PK)
    private Long chatRoomJoinSeqNo;

    // 참여 중인 채팅방 번호
    private Long chatRoomSeqNo;

    // 참여자 회원 번호
    private Long userSeqNo;

    // 마지막으로 읽은 메시지 번호
    private Long lastReadMsgSeqNo;

    // 마지막 입장 시간
    private LocalDateTime lastEnterDt;

    // 채팅방 참여일
    private LocalDateTime crjCreateDt;

    // 현재 참여 여부 (Y: 참여중, N: 나감)
    private String isJoined;

    // 채팅방 참여 정보 수정일
    private LocalDateTime crjUpdateDt;
}
