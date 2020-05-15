package com.journaldev.retrofitintro;

public interface ResultHandler<T> {

    void onSuccess(T data);
    void onFailure(Throwable t);
}
