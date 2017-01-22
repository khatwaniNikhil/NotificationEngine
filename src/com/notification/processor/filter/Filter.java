package com.notification.processor.filter;

import com.notitfication.registration.FilterCriteria;

public interface Filter {

  void setFilterCriteria(FilterCriteria filterCriteria);

  boolean applyFilterCriteria();
}
