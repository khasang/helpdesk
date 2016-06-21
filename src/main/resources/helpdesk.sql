--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.3
-- Dumped by pg_dump version 9.5.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
ALTER TABLE public.users ALTER COLUMN id DROP DEFAULT;
DROP SEQUENCE public.users_id_seq;
DROP TABLE public.users;
DROP EXTENSION plpgsql;
DROP SCHEMA public;
--
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: users; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE users (
    id integer NOT NULL,
    login character varying(100) NOT NULL,
    password character varying(100) NOT NULL,
    role character varying(100) NOT NULL
);


ALTER TABLE users OWNER TO root;

--
-- Name: users_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE users_id_seq OWNER TO root;

--
-- Name: users_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE users_id_seq OWNED BY users.id;


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY users ALTER COLUMN id SET DEFAULT nextval('users_id_seq'::regclass);


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: root
--

INSERT INTO users VALUES (1, 'aaa', '$2a$04$/ZZ8RQhadM.D5F7SkYnws.DJpWxj7gCaMdGs0Fqqf07ynnN//ARNm', 'ROLE_ADMIN');
INSERT INTO users VALUES (20, 'admin', '$2a$10$7E4f.tChYRg7GzFmKrB6zehVlgX5feN7GoQoWvWPblul6DEy8.KnK', 'ROLE_ADMIN');
INSERT INTO users VALUES (21, 'root', '$2a$10$8W8cCCT5mbkIPOcxIfZx6O04Tvxo0U/M4tG6kxhWWlebqSA/4h45.', 'ROLE_ADMIN');
INSERT INTO users VALUES (22, 'user', '$2a$10$RTQsmUi.vRHrSbkhoOrMoOAFwTYF4ZCkQjqs4mlRIzp8pe/xfSzoW', 'ROLE_USER');
INSERT INTO users VALUES (23, 'asd', '$2a$10$5xuyfVNsbxR/eUCzEVjLFuMsAnxnt4o2r6OCInKy4PJ.mvUvL9GmK', 'ROLE_USER');


--
-- Name: users_id_seq; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('users_id_seq', 24, true);


--
-- Name: users_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

