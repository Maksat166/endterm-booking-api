CREATE TABLE IF NOT EXISTS bookings (
                                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                                        type TEXT NOT NULL,
                                        customer_name TEXT NOT NULL,
                                        start_date TEXT NOT NULL,
                                        end_date TEXT,
                                        hotel_name TEXT,
                                        room_type TEXT,
                                        flight_number TEXT,
                                        from_city TEXT,
                                        to_city TEXT,
                                        price REAL NOT NULL
);
