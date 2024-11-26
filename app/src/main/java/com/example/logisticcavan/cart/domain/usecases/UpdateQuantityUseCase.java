package com.example.logisticcavan.cart.domain.usecases;

import com.example.logisticcavan.cart.domain.repos.CartRepo;

import io.reactivex.rxjava3.core.Single;

public class UpdateQuantityUseCase {
    private final CartRepo cartRepo;

    public UpdateQuantityUseCase(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }

    public Single<Boolean> execute(int id, int quantity, double price) {
        return cartRepo.updateQuantity(id, quantity,price);
    }
}
