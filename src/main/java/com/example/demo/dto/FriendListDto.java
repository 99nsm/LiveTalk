package com.example.demo.dto;

import java.time.LocalDateTime;

public class FriendListDto {

    // 친구 목록 고유 번호 (PK)
    private Long friendListSeqNo;

    // 친구 요청자 회원 번호
    private Long requesterUserSeqNo;

    // 친구 요청 받은 회원 번호
    private Long receiverUserSeqNo;

    // 상태 (대기, 수락, 거절, 취소)
    private String friendStatus;

    // 친구 목록 생성일
    private LocalDateTime frdCreateDt;

    // 친구 상태 수정일
    private LocalDateTime frdUpdateDt;
}

