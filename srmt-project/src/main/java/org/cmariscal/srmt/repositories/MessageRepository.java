package org.cmariscal.srmt.repositories;

import org.cmariscal.srmt.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

/**
 * Created by cmariscal on 3/5/2016.
 */
public interface MessageRepository extends JpaRepository<Message, BigInteger> {
}
