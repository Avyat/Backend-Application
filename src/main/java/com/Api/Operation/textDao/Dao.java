package com.Api.Operation.textDao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Api.Operation.text.Text;
public interface Dao extends JpaRepository<Text, Long> {

}
