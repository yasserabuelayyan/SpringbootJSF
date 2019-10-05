package com.springbootjsf.SpringbootJSF.service.imp;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.springbootjsf.SpringbootJSF.service.DayOfWeekResolverService;

@Service
public class DayOfWeekResolverServiceImpl implements DayOfWeekResolverService
{
  @Override
  public String determineDayOfWeek(int year, int month, int dayOfMonth)
  {
    LocalDate resolvedLocalDate = LocalDate.of(year, month, dayOfMonth);
    return convertToDayOfWeekName(resolvedLocalDate.getDayOfWeek());
  }
 
  private String convertToDayOfWeekName(DayOfWeek dayOfWeek)
  {
    return dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
  }
 
}