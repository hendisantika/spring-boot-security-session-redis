INSERT INTO user_role(id, role_name)
VALUES (1, 'USER');
INSERT INTO user_role(id, role_name)
VALUES (2, 'ADMIN');
INSERT INTO user_privilege(id, privilege_name)
VALUES (1, 'canReadUser');
INSERT INTO user_privilege(id, privilege_name)
VALUES (2, 'canReadAdmin');
INSERT INTO user_account(id, username, password, active)
VALUES (1, 'user1', '{noop}user1', 1);
INSERT INTO user_account(id, username, password, active)
VALUES (2, 'user2', '{noop}user2', 1);
INSERT INTO user_account(id, username, password, active)
VALUES (3, 'admin', '{noop}admin', 1);
INSERT INTO user_role_to_privilege(id, role_id, privilege_id)
VALUES (1, 1, 1);
INSERT INTO user_role_to_privilege(id, role_id, privilege_id)
VALUES (2, 2, 1);
INSERT INTO user_role_to_privilege(id, role_id, privilege_id)
VALUES (3, 2, 2);
INSERT INTO user_to_role(id, user_id, role_id)
VALUES (1, 1, 1);
INSERT INTO user_to_role(id, user_id, role_id)
VALUES (2, 2, 1);
INSERT INTO user_to_role(id, user_id, role_id)
VALUES (3, 3, 2);