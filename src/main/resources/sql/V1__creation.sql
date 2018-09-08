DROP TABLE IF EXISTS fibonacci;

CREATE TABLE fibonacci (
  n   INTEGER PRIMARY KEY,
  val BIGINT
);

CREATE UNIQUE INDEX unique_val ON fibonacci (val);