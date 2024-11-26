package com.example.logisticcavan.cart.domain.usecases;

import com.example.logisticcavan.cart.domain.repos.CartRepo;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class EmptyCartUseCase {
    private final CartRepo cartRepo;

    public EmptyCartUseCase(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }

    public Completable execute() {
        return cartRepo.deleteAll();
    }
}
