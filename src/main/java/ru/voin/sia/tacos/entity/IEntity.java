package ru.voin.sia.tacos.entity;

import java.util.UUID;

public interface IEntity {
    Long getId();
    void setId(Long id);
    UUID getUuid();
    void setUuid(UUID id);

//    IEntity clone();
}
