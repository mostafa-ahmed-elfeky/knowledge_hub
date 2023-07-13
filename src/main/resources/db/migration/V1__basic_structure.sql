

CREATE TABLE public.app_user (
    id bigint NOT NULL,
    created_at timestamp(6) without time zone,
    email character varying(255),
    password character varying(255),
    updated_at timestamp(6) without time zone,
    username character varying(255)
);


ALTER TABLE public.app_user OWNER TO keycloak_user;

--
-- TOC entry 203 (class 1259 OID 28366)
-- Name: app_user_id_seq; Type: SEQUENCE; Schema: public; Owner: keycloak_user
--

CREATE SEQUENCE public.app_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.app_user_id_seq OWNER TO keycloak_user;

--
-- TOC entry 2840 (class 0 OID 0)
-- Dependencies: 203
-- Name: app_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: keycloak_user
--

ALTER SEQUENCE public.app_user_id_seq OWNED BY public.app_user.id;


--
-- TOC entry 198 (class 1259 OID 28331)
-- Name: course; Type: TABLE; Schema: public; Owner: keycloak_user
--

CREATE TABLE public.course (
    id bigint NOT NULL,
    created_at timestamp(6) without time zone,
    description character varying(255),
    price numeric(38,2),
    title character varying(255),
    updated_at timestamp(6) without time zone
);


ALTER TABLE public.course OWNER TO keycloak_user;

--
-- TOC entry 200 (class 1259 OID 28342)
-- Name: course_enrollments; Type: TABLE; Schema: public; Owner: keycloak_user
--

CREATE TABLE public.course_enrollments (
    id bigint NOT NULL,
    created_at timestamp(6) without time zone,
    course_id bigint,
    user_id bigint
);


ALTER TABLE public.course_enrollments OWNER TO keycloak_user;

--
-- TOC entry 199 (class 1259 OID 28340)
-- Name: course_enrollments_id_seq; Type: SEQUENCE; Schema: public; Owner: keycloak_user
--

CREATE SEQUENCE public.course_enrollments_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.course_enrollments_id_seq OWNER TO keycloak_user;

--
-- TOC entry 2841 (class 0 OID 0)
-- Dependencies: 199
-- Name: course_enrollments_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: keycloak_user
--

ALTER SEQUENCE public.course_enrollments_id_seq OWNED BY public.course_enrollments.id;


--
-- TOC entry 197 (class 1259 OID 28329)
-- Name: course_id_seq; Type: SEQUENCE; Schema: public; Owner: keycloak_user
--

CREATE SEQUENCE public.course_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.course_id_seq OWNER TO keycloak_user;

--
-- TOC entry 2842 (class 0 OID 0)
-- Dependencies: 197
-- Name: course_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: keycloak_user
--

ALTER SEQUENCE public.course_id_seq OWNED BY public.course.id;


--
-- TOC entry 202 (class 1259 OID 28350)
-- Name: course_reviews; Type: TABLE; Schema: public; Owner: keycloak_user
--

CREATE TABLE public.course_reviews (
    id bigint NOT NULL,
    created_at timestamp(6) without time zone,
    rating integer,
    review character varying(255),
    updated_at timestamp(6) without time zone,
    course_id bigint,
    user_id bigint
);


ALTER TABLE public.course_reviews OWNER TO keycloak_user;

--
-- TOC entry 201 (class 1259 OID 28348)
-- Name: course_reviews_id_seq; Type: SEQUENCE; Schema: public; Owner: keycloak_user
--

CREATE SEQUENCE public.course_reviews_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.course_reviews_id_seq OWNER TO keycloak_user;

--
-- TOC entry 2843 (class 0 OID 0)
-- Dependencies: 201
-- Name: course_reviews_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: keycloak_user
--

ALTER SEQUENCE public.course_reviews_id_seq OWNED BY public.course_reviews.id;


--
-- TOC entry 2693 (class 2604 OID 28371)
-- Name: app_user id; Type: DEFAULT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.app_user ALTER COLUMN id SET DEFAULT nextval('public.app_user_id_seq'::regclass);


--
-- TOC entry 2690 (class 2604 OID 28334)
-- Name: course id; Type: DEFAULT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.course ALTER COLUMN id SET DEFAULT nextval('public.course_id_seq'::regclass);


--
-- TOC entry 2691 (class 2604 OID 28345)
-- Name: course_enrollments id; Type: DEFAULT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.course_enrollments ALTER COLUMN id SET DEFAULT nextval('public.course_enrollments_id_seq'::regclass);


--
-- TOC entry 2692 (class 2604 OID 28353)
-- Name: course_reviews id; Type: DEFAULT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.course_reviews ALTER COLUMN id SET DEFAULT nextval('public.course_reviews_id_seq'::regclass);


--
-- TOC entry 2834 (class 0 OID 28368)
-- Dependencies: 204
-- Data for Name: app_user; Type: TABLE DATA; Schema: public; Owner: keycloak_user
--

COPY public.app_user (id, created_at, email, password, updated_at, username) FROM stdin;
\.


--
-- TOC entry 2828 (class 0 OID 28331)
-- Dependencies: 198
-- Data for Name: course; Type: TABLE DATA; Schema: public; Owner: keycloak_user
--

COPY public.course (id, created_at, description, price, title, updated_at) FROM stdin;
1	\N	java se	50.00	java se	\N
\.


--
-- TOC entry 2830 (class 0 OID 28342)
-- Dependencies: 200
-- Data for Name: course_enrollments; Type: TABLE DATA; Schema: public; Owner: keycloak_user
--

COPY public.course_enrollments (id, created_at, course_id, user_id) FROM stdin;
\.


--
-- TOC entry 2832 (class 0 OID 28350)
-- Dependencies: 202
-- Data for Name: course_reviews; Type: TABLE DATA; Schema: public; Owner: keycloak_user
--

COPY public.course_reviews (id, created_at, rating, review, updated_at, course_id, user_id) FROM stdin;
\.


--
-- TOC entry 2844 (class 0 OID 0)
-- Dependencies: 203
-- Name: app_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: keycloak_user
--

SELECT pg_catalog.setval('public.app_user_id_seq', 1, false);


--
-- TOC entry 2845 (class 0 OID 0)
-- Dependencies: 199
-- Name: course_enrollments_id_seq; Type: SEQUENCE SET; Schema: public; Owner: keycloak_user
--

SELECT pg_catalog.setval('public.course_enrollments_id_seq', 1, false);


--
-- TOC entry 2846 (class 0 OID 0)
-- Dependencies: 197
-- Name: course_id_seq; Type: SEQUENCE SET; Schema: public; Owner: keycloak_user
--

SELECT pg_catalog.setval('public.course_id_seq', 1, true);


--
-- TOC entry 2847 (class 0 OID 0)
-- Dependencies: 201
-- Name: course_reviews_id_seq; Type: SEQUENCE SET; Schema: public; Owner: keycloak_user
--

SELECT pg_catalog.setval('public.course_reviews_id_seq', 1, false);


--
-- TOC entry 2701 (class 2606 OID 28376)
-- Name: app_user app_user_pkey; Type: CONSTRAINT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.app_user
    ADD CONSTRAINT app_user_pkey PRIMARY KEY (id);


--
-- TOC entry 2697 (class 2606 OID 28347)
-- Name: course_enrollments course_enrollments_pkey; Type: CONSTRAINT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.course_enrollments
    ADD CONSTRAINT course_enrollments_pkey PRIMARY KEY (id);


--
-- TOC entry 2695 (class 2606 OID 28339)
-- Name: course course_pkey; Type: CONSTRAINT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.course
    ADD CONSTRAINT course_pkey PRIMARY KEY (id);


--
-- TOC entry 2699 (class 2606 OID 28355)
-- Name: course_reviews course_reviews_pkey; Type: CONSTRAINT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.course_reviews
    ADD CONSTRAINT course_reviews_pkey PRIMARY KEY (id);


--
-- TOC entry 2703 (class 2606 OID 28377)
-- Name: course_enrollments fkajgwo8ps01alwntke3597mcl9; Type: FK CONSTRAINT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.course_enrollments
    ADD CONSTRAINT fkajgwo8ps01alwntke3597mcl9 FOREIGN KEY (user_id) REFERENCES public.app_user(id);


--
-- TOC entry 2704 (class 2606 OID 28361)
-- Name: course_reviews fkgamc8lfj0vca7uq9f6e40mls; Type: FK CONSTRAINT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.course_reviews
    ADD CONSTRAINT fkgamc8lfj0vca7uq9f6e40mls FOREIGN KEY (course_id) REFERENCES public.course(id);


--
-- TOC entry 2702 (class 2606 OID 28356)
-- Name: course_enrollments fkrk0d1a7wqlqao0ypno720c0sb; Type: FK CONSTRAINT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.course_enrollments
    ADD CONSTRAINT fkrk0d1a7wqlqao0ypno720c0sb FOREIGN KEY (course_id) REFERENCES public.course(id);


--
-- TOC entry 2705 (class 2606 OID 28382)
-- Name: course_reviews fkt3lds379d3yhk90riipa3rood; Type: FK CONSTRAINT; Schema: public; Owner: keycloak_user
--

ALTER TABLE ONLY public.course_reviews
    ADD CONSTRAINT fkt3lds379d3yhk90riipa3rood FOREIGN KEY (user_id) REFERENCES public.app_user(id);


-- Completed on 2023-07-02 13:47:22

--
-- PostgreSQL database dump complete
--

