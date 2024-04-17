package com.younesleonjoe.beerinventoryservice.mapper;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Component
public class DateMapper {

  public OffsetDateTime toOffsetDateTime(Timestamp timestamp) {

    if (timestamp == null) return null;

    return OffsetDateTime.from(timestamp.toInstant().atZone(ZoneOffset.UTC));
  }

  public Timestamp toTimestamp(OffsetDateTime offsetDateTime) {

    if (offsetDateTime == null) return null;

    return Timestamp.from(offsetDateTime.toInstant());
  }
}
