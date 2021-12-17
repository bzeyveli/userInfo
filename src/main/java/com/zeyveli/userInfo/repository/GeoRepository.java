package com.zeyveli.userInfo.repository;

import com.zeyveli.userInfo.model.entity.Geo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoRepository extends JpaRepository<Geo, Integer> {
}
