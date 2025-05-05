### ScribeIt 

#### API's 

#### Journal (Reflection) APIs
POST   /api/v1/scribes              → Create a new journal entry
GET    /api/v1/scribes              → List all entries
GET    /api/v1/scribes/{id}         → Get entry by ID
PUT    /api/v1/scribes/{id}         → Update entry
DELETE /api/v1/scribes/{id}         → Delete entry
GET    /api/v1/scribes/date/{yyyy-MM-dd} → Get entry by date

#### Streak APIs
GET    /api/v1/streaks/current      → Get current streak
POST   /api/v1/streaks/check-in     → Mark today's check-in

#### Auth APIs
POST   /api/v1/auth/register        → Register a user
POST   /api/v1/auth/login           → Login
GET    /api/v1/auth/me              → Get logged-in user info

# Profile APIs
GET    /api/v1/profile              → View profile
PUT    /api/v1/profile              → Update profile
