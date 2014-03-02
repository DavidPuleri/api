package com.ekinox.entity;


import com.googlecode.genericdao.dao.hibernate.GeneralDAOImpl;

import java.util.List;

public class LiveEventDaoImpl extends GeneralDAOImpl<LiveEvent, Long> implements LiveEventDao {

  @Override
  public List<LiveEvent> findByRencontreId(int rencontre_id) {
    return null;
  }
}
