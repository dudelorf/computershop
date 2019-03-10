delete from computer_parts;
delete from computer;
delete from parts;

insert into parts
    (id, name, type)
values
    ("HD512GB", "512 GB hard drive", "STORAGE"),
    ("HD1TB", "1 TB hard drive", "STORAGE"),
    ("HD2TB", "2 TB hard drive", "STORAGE"),
    ("RAM4GB", "4 GB ram", "RAM"),
    ("RAM8GB", "8 GB ram", "RAM"),
    ("PRCI3", "i3 processor", "PROCESSOR"),
    ("PRCI5", "i5 processor", "PROCESSOR"),
    ("PRCI7", "i7 processor", "PROCESSOR");
