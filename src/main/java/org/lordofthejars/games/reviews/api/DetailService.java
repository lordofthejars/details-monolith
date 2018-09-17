package org.lordofthejars.games.reviews.api;

import java.util.Optional;

interface DetailService {
    Optional<Detail> findDetailByGameId(long gameId);
}