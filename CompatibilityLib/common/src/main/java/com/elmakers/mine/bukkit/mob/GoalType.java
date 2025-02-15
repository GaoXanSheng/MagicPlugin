package com.elmakers.mine.bukkit.mob;

public enum GoalType {
    AVOID_ENTITY,
    BEG,
    BREAK_DOOR,
    BREATHE_AIR,
    BREED,
    // CAT_LIE_ON_BED,
    // CAT_SIT_ON_BLOCK,
    // DOLPHIN_JUMP
    // DOOR_INTERACT (abstract)
    EAT_BLOCK,
    FLEE_SUN,
    FLOAT,
    FOLLOW_BOAT,
    FOLLOW_FLOCK_LEADER,
    FOLLOW_MOB,
    FOLLOW_OWNER,
    FOLLOW_PARENT,
    GOLEM_RANDOM_STROLL_IN_VILLAGE,
    INTERACT,
    // JUMP (abstract)
    LAND_ON_OWNERS_SHOULDER,
    LEAP_AT_TARGET,
    // LLAMA_FOLLOW_CARAVAN
    LOOK_AT_PLAYER,
    // LOOK_AT_TRADING_PLAYER
    MELEE_ATTACK,
    MOVE_BACK_TO_VILLAGE,
    MOVE_THROUGH_VILLAGE,
    // MOVE_TO_BLOCK (abstract)
    MOVE_TOWARDS_RESTRICTION,
    MOVE_TOWARDS_TARGET,
    OCELOT_ATTACK,
    OFFER_FLOWER,
    OPEN_DOOR,
    PANIC_FIRE, // renamed, use magic panic by default
    // PATHFIND_TO_RAID
    RANDOM_LOOK_AROUND,
    RANDOM_STROLL,
    RANDOM_SWIMMING,
    // RANGED_CROSSBOW_ATTACK,
    // REMOVE_BLOCK,
    RESTRICT_SUN,
    RUN_AROUND_LIKE_CRAZY,
    // SIT_WHEN_ORDERED_TO
    STROLL_THROUGH_VILLAGE,
    SWELL,
    TEMPT,
    // TRADE_WITHER_PLAYER
    TRY_FIND_WATER,
    // USE_ITEM
    WATER_AVOIDING_RANDOM_FLYING,
    WATER_AVOIDING_RANDOM_STROLL,
    ZOMBIE_ATTACK,

    //// TARGET
    DEFEND_VILLAGE_TARGET,
    HURT_BY_TARGET,
    NEAREST_ATTACKABLE_TARGET,
    // NEAREST_ATTACKABLE_WITCH,
    // NEAREST_HEALABLE_RAIDER,
    // NON_TAME_RANDOM_TARGET,
    OWNER_HURT_BY_TARGET,
    OWNER_HURT_TARGET,
    // RESET_UNIVERSAL_ANGER_TARGET,
    // TARGET, (abstract)

    //// MAGIC
    IDLE,
    REQUIREMENTS,
    REQUIREMENT,
    GROUP,
    TRIGGER,
    MAGIC_FOLLOW_OWNER,
    FOLLOW_ENTITY,
    MAGIC_FOLLOW_MOB,
    MAGIC_OWNER_HURT_BY_TARGET,
    MAGIC_OWNER_HURT_TARGET,
    MAGIC_PANIC,
    PANIC, // renamed vanilla goal to panic_fire
    FIND_OWNER,
    CHECK_OWNER
}
