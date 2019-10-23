package ru.voin.sia.tacos.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
@Table(schema = "test")
public abstract class BaseEntity implements IEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Id
//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
//    @Column(name = "uuid", updatable = false, nullable = false)
//    private UUID uuid;
    private String  uuid;

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUuid() {
//        return uuid;
        return null;
    }

    public void setUuid(UUID uuid) {
//        this.uuid = uuid;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        IEntity that = (IEntity) o;

        return getUuid() != null && getUuid().equals(that.getUuid());
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + (null == getUuid() ? super.hashCode() : getUuid().hashCode());
        return hash;
    }
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        IEntity that = (IEntity) o;

        return getId() != null && getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + (null == getId() ? super.hashCode() : getId().hashCode());
        return hash;
    }
}
