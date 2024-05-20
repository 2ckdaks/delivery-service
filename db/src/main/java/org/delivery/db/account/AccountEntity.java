package org.delivery.db.account;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.delivery.db.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuperBuilder // 부모로부터 상속받은 변수도 포함
@Data
@EqualsAndHashCode(callSuper = true) //객체 비교를 위해 사용, callSuper=부모의 값도 포함시킬건지
@Entity
@Table(name = "account")
public class AccountEntity extends BaseEntity {
}
