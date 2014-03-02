package com.ekinox.entity;


import com.googlecode.genericdao.dao.hibernate.GenericDAO;

import java.util.List;

public interface LiveEventDao extends GenericDAO<LiveEvent, Long> {
  public List<LiveEvent> findByRencontreId(int rencontre_id);
}
