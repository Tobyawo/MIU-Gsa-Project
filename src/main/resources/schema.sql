CREATE TABLE supplier (
    supplier_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    contact_phone VARCHAR(20)
);

CREATE TABLE product (
    product_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    unit_price DECIMAL(10, 2),
    quantity_in_stock INT,
    date_supplied DATE,
    supplier_id INT,
    CONSTRAINT fk_supplier FOREIGN KEY (supplier_id) REFERENCES supplier (supplier_id)
);
