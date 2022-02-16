package com.example.demo.application.ver1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    public void save(String itemId) {
        if (itemId.equals("ex")) {
            throw new IllegalStateException("exception");
        }
        sleep(1000);
    }

    private void sleep(int mill) {
        try {
            Thread.sleep(mill);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
