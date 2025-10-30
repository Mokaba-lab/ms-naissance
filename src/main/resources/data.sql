-- ─────────────── INSERT ADDRESSES ───────────────
INSERT INTO addresses (tag, zip, street, city, country) VALUES
        ('CITY_HALL', '224', 'Rue KA 021', 'Conakry', 'Guinée'),  -- ID 1
        ('COMPANY', '224', 'Autoroute Fidel Castro', 'Conakry', 'Guinée'), -- ID 2
        ('COMPANY', '224', 'Rue Kipé Taouyah', 'Ratoma', 'Guinée'), -- ID 3
        ('PROFILE', '224', 'Rue Niger', 'Kaloum', 'Guinée'), -- ID 4
        ('PROFILE', '224', 'Aéroport', 'Gbessia', 'Guinée'), -- ID 5
        ('CITY_HALL', '224', 'Rue de la Liberté', 'Kindia', 'Guinée'); -- ID 6

-- ─────────────── INSERT CITYHALLS ───────────────
INSERT INTO cityhalls (name, description, addresses_id) VALUES
        ('Mairie de Conakry', 'Administration municipale principale de la capitale', 1),
        ('Mairie de Kindia', 'Administration communale de la ville de Kindia', 6);

-- ─────────────── INSERT COMPANIES ───────────────
INSERT INTO companies (name, description, addresses_id) VALUES
        ('Saniya Recyclage', 'Entreprise spécialisée dans la collecte et le recyclage du plastique à Conakry.', 2),
        ('Solene Guinée ESE', 'Technologies & services énergétiques pour l’industrie.', 3);

-- ─────────────── INSERT PROFILES ───────────────
INSERT INTO profiles (civility, first_name, last_name, email, phone, password, addresses_id) VALUES
        ('MR', 'Mouctar', 'Kaba', 'mouctar.kaba@example.com', '+224620000001', 'admin123', 4),
        ('MRS', 'Fatoumata', 'Diallo', 'fatou.diallo@example.com', '+224620000002', 'user123', 5);
