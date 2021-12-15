CREATE TABLE orders (
      id                  BIGSERIAL PRIMARY KEY NOT NULL,
      name          varchar(255) NOT NULL,
      
      price          float8,
      quantity            int NOT NULL,
      status              varchar(255) NOT NULL
     
);